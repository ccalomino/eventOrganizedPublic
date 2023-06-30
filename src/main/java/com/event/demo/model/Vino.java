package com.event.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "vinos")
public class Vino {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "variedad")
    private String variedad;
    
    @Column(name = "bodega")
    private String bodega;
    
    @Column(name = "anno")
    private int anno;
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "region")
    private String region;
    
    @Column(name = "denominacion_de_origen")
    private String denominacionDeOrigen;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "cuerpo")
    private String cuerpo;
    
    @Column(name = "sabor")
    private String sabor;
    
    @OneToOne
    private UvaVino uva;

    @OneToOne
    private CategoriaVino categoria;
    
    @Lob
    @Column(name="img", length=100000)
    private byte[] img;

    
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getVariedad() {
        return variedad;
    }
    
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
    
    public String getBodega() {
        return bodega;
    }
    
    public void setBodega(String bodega) {
        this.bodega = bodega;
    }
    
    public int getAnno() {
        return anno;
    }
    
    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getDenominacionDeOrigen() {
        return denominacionDeOrigen;
    }
    
    public void setDenominacionDeOrigen(String denominacionDeOrigen) {
        this.denominacionDeOrigen = denominacionDeOrigen;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCuerpo() {
        return cuerpo;
    }
    
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    public String getSabor() {
        return sabor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public UvaVino getUva() {
		return uva;
	}


	public void setUva(UvaVino uva) {
		this.uva = uva;
	}


	public CategoriaVino getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaVino categoria) {
		this.categoria = categoria;
	}


	public byte[] getImg() {
		return img;
	}


	public void setImg(byte[] img) {
		this.img = img;
	}
    
	public Vino clone(Vino clonedVino) 
	{
		clonedVino.setNombre(this.nombre);
        clonedVino.setVariedad(this.variedad);
        clonedVino.setBodega(this.bodega);
        clonedVino.setAnno(this.anno);
        clonedVino.setPais(this.pais);
        clonedVino.setRegion(this.region);
        clonedVino.setDenominacionDeOrigen(this.denominacionDeOrigen);
        clonedVino.setTipo(this.tipo);
        clonedVino.setCuerpo(this.cuerpo);
        clonedVino.setSabor(this.sabor);
        clonedVino.setUva(this.uva);
        clonedVino.setCategoria(this.categoria);
        return clonedVino;
	}
    
}
