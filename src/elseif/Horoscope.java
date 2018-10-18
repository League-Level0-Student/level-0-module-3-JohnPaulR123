package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String zodiac = JOptionPane.showInputDialog("What is your star sign?");
		if (zodiac.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null,
					"You are Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		} else if (zodiac.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"You are Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		} else if (zodiac.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null,
					"You are Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if (zodiac.equalsIgnoreCase("Canser")) {
			JOptionPane.showMessageDialog(null, "You are Emotional, group oriented, seeks security, family.");
		} else if (zodiac.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You are Generous, organized, protective, beautiful.");
		} else if (zodiac.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You are Particular, logical, practical, sense of duty, critical.");
		} else if (zodiac.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You are Balanced, seeks beauty, sense of justice.");
		} else if (zodiac.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You are Passionate, exacting, loves extremes, combative, reflective.");
		} else if (zodiac.equalsIgnoreCase("Sagittorius")) {
			JOptionPane.showMessageDialog(null, "You are Happy, absent minded, creative, adventurous.");
		} else if (zodiac.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You are Timeless, driven, calculating, ambitious.");
		} else if (zodiac.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null,
					"You are Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		} else if (zodiac.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You are Likeable, energetic, passionate, sensitive.");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
