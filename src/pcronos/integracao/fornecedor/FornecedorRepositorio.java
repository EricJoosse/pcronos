package pcronos.integracao.fornecedor;

public class FornecedorRepositorio {

	public FornecedorRepositorio() {
	}

	Fornecedor getFornecedor(Integer idFornecedor) {
		Fornecedor f = new Fornecedor();
		f.IdFornecedor = idFornecedor;

		if (idFornecedor == 13) {
			f.NomeFantasiaEmpresa = "Formaggio";
			f.SiglaSistemaFornecedor = "APS";
			f.EmailResponsavelTI = "projetosti@formaggio.com.br";  
			f.EmailResponsavelTIAlternativo = "ti@formaggio.com.br??????"; 
			f.ApelidoResponsavelTI = "Geymison";
			f.ApelidoResponsavelTIAlternativo = "";
			f.FuncaoResponsavelTI = "Coordenador de Projetos de TI";
			f.FuncaoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "Team Viewer";
		}			   
		else if (idFornecedor == 947) {
			f.NomeFantasiaEmpresa = "JR Embalagem";
			f.SiglaSistemaFornecedor = "WinThor";
			f.EmailResponsavelTI = "jrembalagem.ti@gmail.com"; 
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "Ivan";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "AnyDesk";
		}			   
		else if (idFornecedor == 30) {
			f.NomeFantasiaEmpresa = "Prolac";
			f.SiglaSistemaFornecedor = "WinThor";
			f.EmailResponsavelTI = "marcelo@casadoqueijo.net.br"; 
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "Marcelo";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "AnyDesk";
			f.IdAplicativoDesktopRemoto = "servidormaxima@ad";
		}			   
		else if (idFornecedor == 21) {
			f.NomeFantasiaEmpresa = "Mar�timos";
			f.SiglaSistemaFornecedor = "WinThor";
			f.EmailResponsavelTI = "felipe.lolaia@maritimospescados.com.br"; 
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "Felipe";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "Team Viewer";
		}			   
		else if (idFornecedor == 170) {
			f.NomeFantasiaEmpresa = "SOST";
			f.SiglaSistemaFornecedor = "WinThor";
			f.EmailResponsavelTI = "informatica@sost.com.br OU cleijonatassilva@sost.com.br"; 
			f.EmailResponsavelTIAlternativo = "informatica@sost.com.br OU carlossena@sost.com.br";
			f.ApelidoResponsavelTI = "Cleijonatas";
			f.ApelidoResponsavelTIAlternativo = "Sena";
			f.AplicativoDesktopRemoto = "AnyDesk";
		}			   
		else if (idFornecedor == 60) {
			f.NomeFantasiaEmpresa = "Karne Keijo";
			f.SiglaSistemaFornecedor = "SAP";
			f.EmailResponsavelTI = "timons@kk.com.br";
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "Timon";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "Team Viewer";
		}			   
		else if (idFornecedor == 33) {
			f.NomeFantasiaEmpresa = "Comal";
			f.SiglaSistemaFornecedor = "WinThor";
			f.EmailResponsavelTI = "";
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "Team Viewer";
		}			   
		else if (idFornecedor == 51) {
			f.NomeFantasiaEmpresa = "Master Commerce";
			f.SiglaSistemaFornecedor = "WinThor";
			f.EmailResponsavelTI = "";
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "Team Viewer";
		}			   
		else if (idFornecedor == null) {
			f.NomeFantasiaEmpresa = "Monitoramento";
			f.SiglaSistemaFornecedor = "PCronos";
			f.EmailResponsavelTI = "";
			f.EmailResponsavelTIAlternativo = "";
			f.ApelidoResponsavelTI = "";
			f.ApelidoResponsavelTIAlternativo = "";
			f.AplicativoDesktopRemoto = "mstsc";
		}			   
		return f;
	}
}