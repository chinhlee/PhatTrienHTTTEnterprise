package hunre.it.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_sinhvien")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "masv")
	private String masv;
	@Column(name = "tensinhvien")
	private String tensinhvien;
	@Column(name = "diachi")
	private String diachi;
	@Column(name = "sdt")
	private String sdt;
	@Column(name = "lop")
	private String lop;
	@Column(name = "namnhaphoc")
	private int namnhaphoc;

	public Student(long id, String masv, String tensinhvien, String diachi, String sdt, String lop, int namnhaphoc) {
		super();
		this.id = id;
		this.masv = masv;
		this.tensinhvien = tensinhvien;
		this.diachi = diachi;
		this.sdt = sdt;
		this.lop = lop;
		this.namnhaphoc = namnhaphoc;
	}

	public Student() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getTensinhvien() {
		return tensinhvien;
	}

	public void setTensinhvien(String tensinhvien) {
		this.tensinhvien = tensinhvien;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getNamnhaphoc() {
		return namnhaphoc;
	}

	public void setNamnhaphoc(int namnhaphoc) {
		this.namnhaphoc = namnhaphoc;
	}

}
