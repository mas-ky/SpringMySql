package com.springmysql.springmysql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class user {
    @Id
	@Column(name = "id")
    private Integer id;
    private String nama;
    private String alamat;
    private String passwd;

    public user() {
    }

    public user(String alamat, Integer id, String nama, String passwd) {
        this.alamat = alamat;
        this.id = id;
        this.nama = nama;
        this.passwd = passwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


}
