public class TimeCalc {

	public static void main(String [] args) 
	{ 
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
       
		int add = Integer.parseInt(args[1]);
    
		int totalMin = hours * 60 + minutes + add;
		int newHour = (totalMin / 60) % 24; 
		int newMin = totalMin % 60; 

		String formatNewHour = String.format("%02d", newHour);
 		String formatNewMinutes = String.format("%02d", newMin);

        
		System.out.println(formatNewHour + ":" + formatNewMinutes);


    }
}