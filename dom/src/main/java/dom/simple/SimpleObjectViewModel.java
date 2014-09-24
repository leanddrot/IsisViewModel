package dom.simple;

import javax.jdo.annotations.Column;

import org.apache.isis.applib.AbstractViewModel;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.services.memento.MementoService;
import org.apache.isis.applib.services.memento.MementoService.Memento;

public class SimpleObjectViewModel extends AbstractViewModel {

	String memento;
	
	@Override
	public String viewModelMemento() {
		return memento;
	}
	
	@Override
	public void viewModelInit(String memento) {
		
		this.memento = memento;
		Memento m =  mementoService.parse(memento);
		
		setNombre(m.get("nombre", String.class));
		setCantidad(m.get("cantidad", Integer.class));
		setCantidadx2(m.get("cantidadX2", Integer.class));
		setCantidadDividido3(m.get("cantidadDividido3", Double.class));
		
		 
	}

	
	// {{ Nombre (property)
	private String nombre;

	@MemberOrder(sequence = "1")
	@Column(allowsNull = "true")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	// }}


	
	// {{ Cantidad (property)
	private int cantidad;

	@MemberOrder(sequence = "2")
	@Column(allowsNull = "true")
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(final int cantidad) {
		this.cantidad = cantidad;
	}
	// }}


	
	
	// {{ Cantidadx2 (property)
	private int cantidadx2;

	@MemberOrder(sequence = "3")
	@Column(allowsNull = "true")
	public int getCantidadx2() {
		return cantidadx2;
	}

	public void setCantidadx2(final int cantidadx2) {
		this.cantidadx2 = cantidadx2;
	}
	// }}


	// {{ CantidadDividido3 (property)
	private double cantidadDividido3;

	@MemberOrder(sequence = "4")
	@Column(allowsNull = "true")
	public double getCantidadDividido3() {
		return cantidadDividido3;
	}

	public void setCantidadDividido3(final double cantidadDividido3) {
		this.cantidadDividido3 = cantidadDividido3;
	}
	// }}

	@javax.inject.Inject
    private MementoService mementoService;

	
}
