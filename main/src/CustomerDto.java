@Data
public class CustomerDto {
  
  private UUID customerId;
  private String customerName;
  private String customerAddress;
  
  public CustomerDto(UUID customerId, String customerName, String customerAddress) {
  
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerAddress = customerAddress;
    
  }
  
  public static void main(String[] args) {
   
    UUID id = (UUID)args[0];
    String name = args[1];
    Sring address = args[2];
    
    CustomerDto customerDto = new CustomerDto(id, name, address);
    
    System.out.println("This is a test for the merge.");
    
  }
  
}
