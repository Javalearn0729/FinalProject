package _03_input;

import java.util.ArrayList;

public class ExecuteInput {

	public static void main(String[] args) {
		
		CulturalAndCreativeShops_Input input = new CulturalAndCreativeShops_Input();
		
		ArrayList<CultureAndCreativeShopsTable> list = input.readJsonToTable();
		
		input.creatShopsInfoTable(list);
		
	}

}
