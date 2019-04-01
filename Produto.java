public class Produto {

	private int id ;
	private String nome ;
	private String descricao ;
	private Fornecedor fornecedor ;

	public int getId () {

		return id ;

	}

	public void setId ( int i ) {

		id = i ;
	
	}

	public String getNome () {

		return nome ;

	}

	public void setNome ( String n ) {

		nome = n ;
	
	}

	public String getDescricao () {

		return descricao ;

	}

	public void setDescricao ( String d ) {

		descricao = d ;
	
	}

	public Fornecedor getFornecedor () {

		return fornecedor ;

	}

	public void setFornecedor ( Fornecedor f ) {

		fornecedor = f ;
	
	}

}