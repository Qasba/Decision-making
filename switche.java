class Main {
  public static void main(String[] args) {

    int number = 04;
    String size;

    switch (number) {

      case 01:
        size = "Small";
        break;

      case 02:
        size = "Medium";
        break;
        
      case 03:
        size = "Large";
        break;

      case 04:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}