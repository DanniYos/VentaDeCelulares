package Controller;

import Model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

import java.math.BigInteger;

public class ClienteController {
    EntityManager em = JpaUtil.getEntityManager();
    public void guardarCliente(Cliente cliente){
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }

    public Cliente buscarCliente(BigInteger dpi){
        try {
            Cliente cliente = em.createQuery("SELECT c FROM  Cliente c WHERE c.dpi = :dpi ", Cliente.class).setParameter("dpi", dpi).getSingleResult();
            System.out.println(cliente.toString());
            return cliente;
        }catch (NoResultException e){
            System.out.println("Cliente no encontrado");
            return null;
        }finally {
            em.close();
        }

    }
}
