package Project1;

public class ListTest {

	public static void main(String[] args) {

		LinkedList passengerList = new LinkedList();

		// read the first line
		FileIn fileInput = new FileIn();
		String delimiter = ",";
		fileInput
				.openFile("C:\\Users\\SimmonsCS28\\workspace\\CompSci223\\src\\Project1\\titanic.txt");
		String line = fileInput.readLine();

		line = fileInput.readLine();
		while (line != null) {
			// Split line into 5 pieces first before creating object
			String[] tempInputArray = line.split(delimiter);

			// [0] = Index, [1] = Ship Class, [2] = Age, [3] = Sex, [4] =
			// Survived
			Passenger passenger = new Passenger(tempInputArray[0],
					tempInputArray[1], tempInputArray[2], tempInputArray[3],
					tempInputArray[4]);
			// Push that object into the listObj
			passengerList.insertAtHead(passenger);
			// Read another line
			line = fileInput.readLine();
		}
		passengerList.printList();

		passengerList.counts(passengerList);
		
		passengerList.sortSurvived(passengerList);

	}
}
