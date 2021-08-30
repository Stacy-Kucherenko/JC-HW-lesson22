package lviv.lgs.ua;

import javax.sound.midi.VoiceStatus;

public class Pet {
	
	public static void main(String[] args) {
		
		PetInterface cow = () -> "Muuu ... I'm cow";
		PetInterface cat = () -> "Meow ... I'm cat";
		PetInterface dog = () -> "Bark .. I'm dog";
		
		voice(cow.voice(), "Burenka");
		voice(cat.voice(), "Murka");
		voice(dog.voice(), "Berta");
		
		
	}
	
	public static void voice (String voice, String name) {
		System.out.println(voice + " " + name );
	}

}
