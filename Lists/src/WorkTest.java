import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkTest {
    public static void main(String[] args) {
        List<String> xAxisFields = Arrays.asList("Product", "Segment", "DiscountBand", "ManufacturingPrice", "Country", "SalePrice", "MonthName");
        List<String> avgFields = Arrays.asList("COGS", "Discounts", "GrossSales", "Sales", "UnitsSold", "ManufacturingPrice", "Profit", "SalePrice");

// Make a copy to avoid modifying the original list
        List<String> uniqueXAxisFields = new ArrayList<>(xAxisFields);

// Remove all elements from xAxisFields that are also in avgFields
        uniqueXAxisFields.removeAll(avgFields);

        System.out.println("Unique fields in xAxisFields: " + uniqueXAxisFields);
    }
}
