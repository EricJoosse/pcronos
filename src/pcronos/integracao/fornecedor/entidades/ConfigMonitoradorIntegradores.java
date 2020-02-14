package pcronos.integracao.fornecedor.entidades;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import org.hibernate.validator.constraints.Length;

import pcronos.integracao.fornecedor.annotations.ValidConfigMonitoradorIntegradores;

//import org.hibernate.validator.Length;  // hibernate.validator.3.1.0.GA
import javax.validation.constraints.Size;


@Entity // Para evitar org.hibernate.MappingException: Unknown entity que acontece quando usar class-level constraints com EL
@Table(name="Configuracao_Monitorador_Integradores")
// O seguinte d� erro javax.el.PropertyNotFoundException
//@ValidConfigMonitoradorIntegradores( message = "Fornecedor ${validatedValue.IdFornecedor} inv�lido")
@ValidConfigMonitoradorIntegradores( message = "Entidade ${validatedValue}: Fornecedor ${validatedValue.getIdFornecedor()} inv�lido")
// N�o funciona:
//@ValidConfigMonitoradorIntegradores( message = "Entidade ${validatedValue.toString().replace(\"cronos.integracao.fornecedor.entidades\",\"\"}: Fornecedor ${validatedValue.getIdFornecedor()} inv�lido")
public class ConfigMonitoradorIntegradores {

	public ConfigMonitoradorIntegradores() {}
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_config_monitorador_integradores_conmonint")
	public int Id;
	
	@Column(name="id_fornecedor_fornec")
	public int IdFornecedor;
	// O seguinte serve apenas para evitar erro "javax.el.PropertyNotFoundException" pelo class-level Hibernate constraint com EL:
	public int getIdFornecedor() { return IdFornecedor; }
	
	
	@Column(name="id_vendedor_responsavel_integracao_ususis")
	public int IdVendedorResponsavel;
	
	@Column(name="sn_em_producao_conmonint")
	public boolean IsEmProducao;

    @Column(name="apelido_contato_ti_conmonint")
    @Size(max=15)
    public String ApelidoContatoTI;
    
	@Column(name="email_contato_ti_conmonint")
    @Size(max=30)
	public String EmailContatoTI;
	
	@Column(name="skype_contato_ti_conmonint")
    @Size(max=30)
	public String SkypeContatoTI;
	
	@Column(name="telefone_contato_ti_conmonint")
    @Size(max=30)
	public String TelefoneContatoTI;
	
	@Column(name="funcao_contato_ti_conmonint")
    @Size(max=30)
	public String FuncaoContatoTI;

	@Column(name="apelido_contato_ti_secundario_conmonint")
 // @Length(max=15)
 // N�o funcionou: @Length(max = 15, message = "IdFornecedor = ${ConfigMonitoradorIntegradores.IdFornecedor}: ApelidoContatoTIsecundario = ${validatedValue}, tamanho = ${validatedValue.length()}, max = {max}")
 // N�o funcionou: @Length(max = 15, message = "IdFornecedor = ${IdFornecedor}: ApelidoContatoTIsecundario = ${validatedValue}, tamanho = ${validatedValue.length()}, max = {max}")
 // N�o funcionou: @Length(max = 15, message = "${propertyPath} = ${validatedValue}, tamanho = ${validatedValue.length()}, max = {max}")
	@Length(max = 15, message = " = ${validatedValue}, tamanho = ${validatedValue.length()}, max = {max}")
	public String ApelidoContatoTIsecundario;
	
	@Column(name="email_contato_ti_secundario_conmonint")
	@Size(max=30)
	public String EmailContatoTIsecundario;
	
	@Column(name="skype_contato_ti_secundario_conmonint")
    @Size(max=30)
	public String SkypeContatoTIsecundario;
	
	@Column(name="telefone_contato_ti_secundario_conmonint")
    @Size(max=30)
	public String TelefoneContatoTIsecundario;

	@Column(name="funcao_contato_ti_secundario_conmonint")
    @Size(max=30)
	public String FuncaoContatoTIsecundario;

	@Column(name="aplicativo_desktop_remoto_conmonint")
    @Size(max=30)
	public String AplicativoDesktopRemoto;
	
	@Column(name="id_aplicativo_desktop_remoto_conmonint")
    @Size(max=30)
	public String IdAplicativoDesktopRemoto;
	
	@Column(name="dt_cadastro_conmonint")
	public LocalDateTime DtCadastro;
 	
	@Column(name="dt_desativacao_conmonint")
	public LocalDateTime DtDesativacao;
 	
	@Column(name="dt_alteracao_conmonint")
	public LocalDateTime DtAlteracao;
 	
	@Column(name="user_id_ususis")
	public int IdUsuario;
}