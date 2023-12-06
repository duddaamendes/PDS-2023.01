package modelo;

import java.time.LocalDate;

public class InfoViagem {
	
	private int idReserva;
	private Enum status;
	private String nome;
	private String emial;
	private String telefone;
	private String destino;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	private Enum acomodacao;
	private Enum transporte;
	private String atividades;
	private Double orcaomento;
	private String doc;
	
	public Double getOrcaomento() {
		return orcaomento;
	}
	public void setOrcaomento(Double orcaomento) {
		this.orcaomento = orcaomento;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Enum getStatus() {
		return status;
	}
	public void setStatus(Enum status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}
	public Enum getAcomodacao() {
		return acomodacao;
	}
	public void setAcomodacao(Enum acomodacao) {
		this.acomodacao = acomodacao;
	}
	public Enum getTransporte() {
		return transporte;
	}
	public void setTransporte(Enum transporte) {
		this.transporte = transporte;
	}
	public String getAtividades() {
		return atividades;
	}
	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}

}
