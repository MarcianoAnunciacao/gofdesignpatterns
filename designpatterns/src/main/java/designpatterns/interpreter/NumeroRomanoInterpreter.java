package designpatterns.interpreter;

public abstract class NumeroRomanoInterpreter {

	private void consumirUmaCasa(Contexto contexto) {
		contexto.setInput(contexto.getInput().substring(1));
	}

	private void consumirDuasCasa(Contexto contexto) {
		contexto.setInput(contexto.getInput().substring(2));
	}

	private void adicionarValorOutput(Contexto contexto, int numero) {
		contexto.setOut(contexto.getOut() + (numero * multiplicador()));
	}

	public abstract int multiplicador();

	public abstract String um();

	public abstract String quatro();

	public abstract String cinco();

	public abstract String nove();

	public void interpretar(Contexto ctx) {
		if (ctx.getInput().length() == 0) {
			return;
		}

		// os valores 9 e 4 são os únicos que possuem duas casas
		if (ctx.getInput().startsWith(nove())) {
			adicionarValorOutput(ctx, 9);
			consumirDuasCasa(ctx);
		} else if (ctx.getInput().startsWith(quatro())) {
			adicionarValorOutput(ctx, 4);
			consumirDuasCasa(ctx);
		} else if (ctx.getInput().startsWith(cinco())) {
			adicionarValorOutput(ctx, 5);
			consumirUmaCasa(ctx);
		}

		//os valores de 1 são os únicos que repetem
		while(ctx.getInput().startsWith(um())) {
			adicionarValorOutput(ctx, 1);
			consumirUmaCasa(ctx);
		}
		
	}
}
