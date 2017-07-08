import java.util.HashMap;
class MapOfTheHashmatique {
	public static void main (String[] args) {
		HashMap <String, String> trackList = new HashMap<>();
		trackList.put("Taco Nights", "Late night hungers; feeling it now");
		trackList.put("Beauty of the Night", "Girl you're hot; hot like fire!");
		trackList.put("Beast Mode", "Coding is fun; oh, oh; lots of fun");
		trackList.put("Vim", "My favorite editor; lyrics escape me");
		System.out.println(trackList.get("Beast Mode"));
		System.out.println(trackList);
	}
}
