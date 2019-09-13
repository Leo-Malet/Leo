package exo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;


public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}



	public Guitar getGuitar(String serialNumber) {
		Iterator<Guitar> iterator = guitars.iterator();
		Guitar guitarfound = null;
		while(Objects.isNull(guitarfound) && iterator.hasNext()){
			Guitar currentguitar = iterator.next();
			if (currentguitar.getSerialNumber()==serialNumber) {
				guitarfound=currentguitar;
			}
		}
		return guitarfound;
	}

	public List search(Guitar searchGuitar) {
		
		List<Guitar> list2guitare = new ArrayList<>();
		for(Guitar guitar : guitar){
			boolean filterBack = false;
			boolean filterTop = false;
			boolean filterModel = false;
			boolean filterType = false;
			boolean builder = false;
			filterBack =!isFilter(searchGuitar.getBackWood())||Objects.equals(guitar.getBackWood(), searchGuitar.)
		}

		
		
		
		
		return list2guitare;

	}

	public void addGuitar(String serialNumber, double price, Builder collings, String model, Type acoustic,
			Wood indianRosewood, Wood sitka) {
		this.guitars.add(new Guitar( serialNumber,  price,  collings,  model,  acoustic,indianRosewood,  sitka));
		
	}

}
