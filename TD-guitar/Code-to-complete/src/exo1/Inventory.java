package exo1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import exo2.Builder;
import exo2.Type;
import exo2.Wood;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price,
			String builder, String model,
			String type, String backWood, String topWood) {
			this.guitars.add(new Guitar(serialNumber,price,builder,model,type,backWood,topWood));
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

	public Guitar search(Guitar searchGuitar) {
		
		Optional<Guitar> findFirst = guitars.stream().filter(guitar -> guitar.equals(searchGuitar)).findFirst();
		return findFirst.isPresent() ? findFirst.get( ): null;

	}


}
