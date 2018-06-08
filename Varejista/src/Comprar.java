import java.awt.List;

public class Comprar {
	
	private Promocao promocao;
	private Cliente cliente;
	private float valor;
	private List itens;
	
	
	public Comprar(float valor, Cliente cliente, Promocao promocao) {
		this.valor = valor;
		this.cliente = cliente;
		this.promocao = promocao;
	}

	
	
	public float calculaTotal(EscolhaDesconto descontos) {
		float totalDescontos = descontos.contadorDescontos();
		
		return valor - totalDescontos;
	}
}
