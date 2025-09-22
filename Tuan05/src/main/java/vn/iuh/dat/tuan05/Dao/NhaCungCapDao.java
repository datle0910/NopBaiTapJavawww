package vn.iuh.dat.tuan05.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import vn.iuh.dat.tuan05.Entity.NhaCungCap;
import vn.iuh.dat.tuan05.Util.JpaUtil;

import java.util.List;

public class NhaCungCapDao {
    public List<NhaCungCap> findAll() {
        EntityManager em = JpaUtil.getEm();
        try {
            return em.createQuery("SELECT n FROM NhaCungCap n", NhaCungCap.class).getResultList();
        } finally { em.close(); }
    }

    public List<NhaCungCap> search(String q) {
        EntityManager em = JpaUtil.getEm();
        try {
            TypedQuery<NhaCungCap> query = em.createQuery(
                    "SELECT n FROM NhaCungCap n WHERE " +
                            "CAST(n.mancc AS string) LIKE :kw OR " +
                            "LOWER(n.tennhacc) LIKE :kw OR " +
                            "LOWER(n.diachi) LIKE :kw OR " +
                            "LOWER(n.sodienthoai) LIKE :kw",
                    NhaCungCap.class
            );
            query.setParameter("kw", "%" + q.toLowerCase() + "%");
            return query.getResultList();
        } finally { em.close(); }
    }
}
