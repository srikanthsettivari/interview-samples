package com.javatechie.jwt.api.practice.java8;

import com.javatechie.jwt.api.practice.java8.MusicalInstrument;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparatorcomparingMethod {
	private static List musicalInstruments=new ArrayList<>();
	static {
		musicalInstruments.add(new MusicalInstrument("Trumpet","brass"));
		musicalInstruments.add(new MusicalInstrument("Tuba","brass"));
		musicalInstruments.add(new MusicalInstrument("Timpani","percussion"));
		musicalInstruments.add(new MusicalInstrument("Piano","keyboard"));
	}
	public static void main (String args[]) {
		System.out.println("Musical instruments in the collection sorted by name:");
		Collections.sort(musicalInstruments, Comparator.comparing((MusicalInstrument instrument) -> instrument.getName()));
		musicalInstruments.stream().forEach(System.out::println);
		
		System.out.println("Musical instruments in the collection sorted by type:");
		Collections.sort(musicalInstruments, Comparator.comparing((MusicalInstrument instrument) -> instrument.getType()));
		musicalInstruments.stream().forEach(instrument->System.out.println(instrument));
	}
}