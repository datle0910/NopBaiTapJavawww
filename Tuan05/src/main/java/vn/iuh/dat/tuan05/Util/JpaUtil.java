package vn.iuh.dat.tuan05.Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("ql_dienthoaiPU");

    public static EntityManager getEm() {
        return emf.createEntityManager();
    }
}
