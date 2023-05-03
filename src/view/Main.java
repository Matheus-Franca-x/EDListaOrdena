package view;

import model.ListaInt;

public class Main {

	public static void main(String[] args) 
	{
		int[] vet = {10, 5, 8, 1, 9, 2, 4, 7, 3, 6};
		
		ListaInt l = new ListaInt();
		
		l.addFirst(vet[0]);
		
		int tam = vet.length;
		
		for (int i = 1; i < tam; i++)
		{
			try {
				l.addLast(vet[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < tam; i++) //Ordena valores
		{
			for (int j = 0; j < tam; j++)
			{
				try {
					if(l.get(i) < l.get(j))
					{
						int aux = l.get(i);
						l.add(l.get(j), i);
						l.remove(i+1);
						l.add(aux, j);
						l.remove(j+1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		for(int i = 0; i < tam; i++) //print valores
		{
			try {
				System.out.println(l.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
