package learnConfiguration.springFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Student(String branch,int year){}
record Address (String location,int pincode){}

@Configuration
public class HelloLearnConfiguration {

    @Bean
    public String Branch(){
        return "Information Technology";
    }
    @Bean
    public String name(){
        return "Krishna Patidar";
    }@Bean
    public int year(){
        return 3;
    }@Bean
    public float grade(){
        return 6.8f;
    }
    @Bean
    public Address address(){
        return new Address("Bhaskaracharya Boy's Hostel",458336);
    }

    @Bean
    public Student student(){
        return new Student(Branch(),year());
    }

    @Bean
    public Student student2(String Branch , int year){
        return new Student(Branch="CSE",year=4);
    }

}
