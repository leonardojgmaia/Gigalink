import java.util.* ;

public class Pedido {

	private int id ;
	private String datahora ;
	private String notafiscal ;
	private float valorfrete ;
	private float desconto ;
	private float valortotal ;
	private ArrayList < Item > items = new ArrayList < Item > () ;
	private Transportadora transportadora ;

	public int getId () {

		return id ;

	}

	public void setId ( int i ) {

		id = i ;
	
	}

	public String getDatahora () {

		return datahora ;

	}

	public void setDatahora ( String d ) {

		datahora = d ;
	
	}

	public String getNotafiscal () {

		return notafiscal ;

	}

	public void setNotafiscal ( String n ) {

		notafiscal = n ;
	
	}

	public float getValorfrete () {

		return valorfrete ;

	}

	public void setValorfrete ( float v ) {

		valorfrete = v ;
	
	}

	public float getDesconto () {

		return desconto ;

	}

	public void setDesconto ( float d ) {

		desconto = d ;
	
	}

	public float getValortotal () {

		return valortotal ;

	}

	public void setValortotal ( float v ) {

		valortotal = v ;
	
	}

	public Transportadora getTransportadora () {

		return transportadora ;

	}

	public void setTransportadora ( Transportadora t ) {

		transportadora = t ;
	
	}


	public ArrayList < Item > getItems () {

		return items ;

	}

	public void setItems ( Item i ) {

		items.add ( i ) ;
	
	}

}