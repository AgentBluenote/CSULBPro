package CECS;

import java.lang.*;
import java.util.*;

//  
//  Map sutdents/share ~home directory to any computer on campus.
// 
public interface NFSServices{

//    public void queryCityLegislation( String zipcode );

   public String getName();
   public void setName( String name );

   public String getSSNumber();
   public void setSSNumber( String ss_number );

   
//   public String getHomeDirectory();

   public String getLicenseAgreement();
}
