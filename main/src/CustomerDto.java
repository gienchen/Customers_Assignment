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
  
    System.out.println("This is a test!");
    
  }
  
}
