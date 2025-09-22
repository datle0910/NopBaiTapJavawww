package vn.iuh.dat.tuan05.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Nhacungcap")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mancc;

    private String tennhacc;
    private String diachi;
    private String sodienthoai;

    @OneToMany(mappedBy = "ncc", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DienThoai> dienthoais;

}
