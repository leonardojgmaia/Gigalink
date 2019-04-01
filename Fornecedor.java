import java.util.* ;

public class Fornecedor {

	private int id ;
	private String nome ;
	private String descricao ;
	private String cidade ;
	private String endereco ;
	private String bairro ;
	private int numero ;
	private ArrayList < Email >  emails = new ArrayList < Email > () ;
	private ArrayList < Telefone >  telefones = new ArrayList < Telefone > () ;

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

	public void setDescricao( String d ) {

		descricao = d ;
	
	}

	public String getCidade () {

		return cidade ;

	}

	public void setCidade ( String c ) {

		cidade = c ;
	
	}

	public String getEndereco () {

		return endereco ;

	}

	public void setEndereco ( String e ) {

		endereco = e ;
	
	}

	public String getBairro () {

		return bairro ;

	}

	public void setBairro ( String b ) {

		bairro = b ;
	
	}

	public int getNumero () {

		return numero ;

	}

	public void setNumero ( int n ) {

		numero = n ;
	
	}

	public ArrayList < Email > getEmails () {

		return emails ;

	}

	public void setEmails ( Email e ) {

		emails.add ( e ) ;
	
	}


	public ArrayList < Telefone > getTelefones () {

		return telefones ;

	}

	public void setTelefones ( Telefone t ) {

		telefones.add ( t ) ;
	
	}

}
