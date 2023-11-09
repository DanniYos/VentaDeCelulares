package Controller;

import Model.Cliente;
import jakarta.persistence.EntityManager;
import util.JpaUtil;

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
}
