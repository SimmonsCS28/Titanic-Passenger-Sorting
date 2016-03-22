package Project1;

import Lab1.ListNode;

public class LinkedList {

	private ListNode firstNode;
	private ListNode lastNode;
	private int size;

	public LinkedList() {
		size = 0;
		firstNode = lastNode = null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (firstNode == null) {
			return true;
		} else
			return false;

	}

	public void insertAtHead(Object item) {

		if (isEmpty()) {
			ListNode newNode = new ListNode(item);
			firstNode = lastNode = newNode;
		} else {
			ListNode newNode = new ListNode(item);
			lastNode.setNextNode(newNode);
			lastNode = newNode;

		}
		size++;
	}

	// Method to print entire list
	public void printList() {
		ListNode current = firstNode;
		while (current.getNextNode() != null) {
			System.out.println(((Passenger) current.getData()).getIndex()
					+ "\t" + ((Passenger) current.getData()).getShipClass()
					+ "\t" + ((Passenger) current.getData()).getAge() + "\t"
					+ ((Passenger) current.getData()).getSex() + "\t"
					+ ((Passenger) current.getData()).getSurvived());
			current = current.getNextNode();
		}

	}
	
	// Method to create a report listing:
	// How many people survived
	// How many men, women, and children did not survive
	// How many first class, second class, and third class passengers survived
	public void counts(LinkedList list) {
		ListNode current = firstNode;
		int men = 0, women = 0, children = 0, firstClass = 0, secondClass = 0, thirdClass = 0, survived = 0, nonSurvived = 0;
		while (current.getNextNode() != null) {
			String tempSurvived = ((Passenger) current.getData()).getSurvived();
			if (tempSurvived.equals(" no ")) {
				nonSurvived += 1;
				if (((Passenger) current.getData()).getSex().equals(" man "))
					men += 1;
				if (((Passenger) current.getData()).getSex().equals(" women "))
					women += 1;
				if (((Passenger) current.getData()).getAge().equals(" child "))
					children += 1;
			}

			else
				survived += 1;
			if (tempSurvived.equals(" yes ")) {
				if (((Passenger) current.getData()).getShipClass().equals(
						" 1st class "))
					firstClass += 1;
				if (((Passenger) current.getData()).getShipClass().equals(
						" 2nd class "))
					secondClass += 1;
				if (((Passenger) current.getData()).getShipClass().equals(
						" 3rd class "))
					thirdClass += 1;
			}
			current = current.getNextNode();
		}
		// Print out report
		System.out.println("Survived: " + survived + "\nNon-Survived: "
				+ nonSurvived
				+ "\n\nMen \t Women \t Children \t Total Non-Survived" + "\n"
				+ men + "\t " + women + "\t " + children + "\t\t "
				+ nonSurvived + "\n\n"
				+ "First Class \t Second Class \t Third Class"
				+ "\t Total Survived" + "\n" + firstClass + "\t\t "
				+ secondClass + "\t\t " + thirdClass + "\t\t " + survived);
	}

	
	// Method to sort passengers by survived passengers first then age and class. 
	// Then sort by non-survived passengers first and class. 
	public void sortSurvived(LinkedList list) {
		int i;
		Passenger[] passengerArray = new Passenger[list.size()];
		ListNode currentNode = list.firstNode;
		for (i = 0; i < passengerArray.length; i++) {
			Passenger currentPas = (Passenger) currentNode.getData();
			passengerArray[i] = new Passenger(currentPas.getIndex(),
					currentPas.getShipClass(), currentPas.getAge(),
					currentPas.getSex(), currentPas.getSurvived());
			currentNode = currentNode.getNextNode();
		}
		for (i = 0; i < passengerArray.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < passengerArray.length; j++) {
				if (passengerArray[j].getSurvived().compareTo(
						passengerArray[minIndex].getSurvived()) < 0) {

				} else if (passengerArray[j].getSurvived().compareTo(
						passengerArray[minIndex].getSurvived()) == 0) {
					if (passengerArray[j].getAge().compareTo(
							passengerArray[minIndex].getAge()) < 0)
						minIndex = j;
					else if (passengerArray[j].getAge().compareTo(
							passengerArray[minIndex].getAge()) == 0)
						if (passengerArray[j].getShipClass().compareTo(
								passengerArray[minIndex].getShipClass()) < 0)
							minIndex = j;
				}

			}
			if (minIndex != i) {
				Passenger tempPass = passengerArray[i];
				passengerArray[i] = passengerArray[minIndex];
				passengerArray[minIndex] = tempPass;

			}

		}

		for (i = 0; i < passengerArray.length; i++) {
			System.out.println(passengerArray[i].getIndex() + "\t"
					+ passengerArray[i].getSurvived() + "\t"
					+ passengerArray[i].getAge() + "\t"
					+ passengerArray[i].getShipClass());
		}

	}
}