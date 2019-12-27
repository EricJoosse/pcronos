package pcronos.integracao.fornecedor.entidades;

import java.time.LocalDateTime;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="Configuracao_Instalador_Integrador_Nuvem")
public class ConfigInstaladorIntegradorNuvem {

	public ConfigInstaladorIntegradorNuvem() {}
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_config_instalador_integrador_nuvem_ciintnuv")
	int Id;
	
	@Column(name="id_sistema_integrado_sisint")
	int IdSistemaIntegrado;
	
    @Column(name="tipo_sist_operacional_ciintnuv")
    @Length(max=30)
    String TipoSO;
    
    @Column(name="sist_operacional_32_ou_64_bit_ciintnuv")
    @Length(max=6)
    String So32ou64bit;
    
    @Column(name="espaco_livre_disco_ciintnuv")
    @Length(max=10)
    String EspacoLivreDisco;
    
    @Column(name="memoria_ram_livre_ciintnuv")
    @Length(max=10)
    String MemoriaRamLivre;
    
    @Column(name="versao_jre_ciintnuv")
    @Length(max=15)
    String VersaoJRE;
    
    @Column(name="tipo_jre_ciintnuv")
    @Length(max=10)
    String TipoJRE;
    
    @Column(name="versao_integrador_ciintnuv")
    @Length(max=10)
    String VersaoIntegrador;
    
    @Column(name="disco_integrador_ciintnuv")
    @Length(max=1)
    char DiscoIntegrador;
    
    @Column(name="dir_programfiles_ciintnuv")
    @Length(max=30)
    String DirProgramfiles;
    
    @Column(name="endereco_ip_publico_servidor_ciintnuv")
    @Length(max=30)
    String EnderecoIpPublicoServidor;
    
    @Column(name="porta_ip_aberta_ciintnuv")
    @Length(max=15)
    String PortaIpAberta;
    
    @Column(name="frequencia_processamento_ciintnuv")
    @Length(max=10)
    String FrequenciaProcessamento;
    

    
    @Column(name="apelido_contato_ti_nuvem_ciintnuv")
    @Length(max=15)
    String ApelidoContatoTiNuvem;
    
	@Column(name="email_contato_ti_nuvem_ciintnuv")
    @Length(max=30)
	String EmailContatoTiNuvem;
	
	@Column(name="skype_contato_ti_nuvem_ciintnuv")
    @Length(max=30)
	String SkypeContatoTiNuvem;
	
	@Column(name="telefone_contato_ti_nuvem_ciintnuv")
    @Length(max=30)
	String TelefoneContatoTiNuvem;
	
	
	

	@Column(name="apelido_contato_ti_secundario_nuvem_ciintnuv")
	@Length(max=15)
	String ApelidoContatoTIsecundarioNuvem;
	
	@Column(name="email_contato_ti_secundario_nuvem_ciintnuv")
	@Length(max=30)
	String EmailContatoTIsecundarioNuvem;
	
	@Column(name="skype_contato_ti_secundario_nuvem_ciintnuv")
    @Length(max=30)
	String SkypeContatoTIsecundarioNuvem;
	
	@Column(name="telefone_contato_ti_secundario_nuvem_ciintnuv")
    @Length(max=30)
	String TelefoneContatoTIsecundarioNuvem;

	
	
	@Column(name="dt_cadastro_ciintnuv")
 	LocalDateTime DtCadastro;
 	
	@Column(name="dt_desativacao_ciintnuv")
 	LocalDateTime DtDesativacao;
 	
	@Column(name="dt_alteracao_ciintnuv")
 	LocalDateTime DtAlteracao;
 	
	@Column(name="user_id_ususis")
	int IdUsuario;
}
