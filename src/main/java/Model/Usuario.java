package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Usuario {
        @Id
        private int id;
        @Column(name = "NOMBE")
        private String nombre;
        @Column(name = "PASSWORD")
        private String password;

        public Usuario(int id, String nombre, String password) {
            this.id = id;
            this.nombre = nombre;
            this.password = password;
        }

        public Usuario() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


}
