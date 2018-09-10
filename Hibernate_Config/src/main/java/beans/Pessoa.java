package beans;

import javax.persistence.*;

@Entity
@Table (name="Pessoa")
public class Pessoa {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="pes_id")
	private int id;
	@Column (name="pes_nome")
	private String nome;
	@Column (name="pes_cpf")
	private String cpf;
	@Column (name="pes_rg")
	private String rg;
	@Column (name="pes_data_nasc")
	private String data_nasc;
	@Column (name="pes_rua")
	private String rua;
	@Column (name="pes_bairro")
	private String bairro;
	@Column (name="pes_cidade")
	private String cidade;
	@Column (name="pes_uf")
	private String uf;
	@Column (name="pes_cep")
	private int cep;
	@Column (name="pes_email")
	private String email;
	@Column (name="pes_senha")
	private String senha;
	@Column (name="pes_tipo")
	private String tipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
