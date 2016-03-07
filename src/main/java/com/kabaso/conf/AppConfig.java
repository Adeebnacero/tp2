package com.kabaso.conf;

import com.kabaso.services.ElectricityService;
import com.kabaso.services.Impl.CoalServiceImpl;
import com.kabaso.services.Impl.ElectricityServiceImpl;
import com.kabaso.services.Impl.HydroServiceImpl;
import com.kabaso.services.Impl.NuclearServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hashcode on 2016/03/07.
 */
@Configuration
public class AppConfig {
    @Bean(name="genretired")
    public ElectricityService getGenetic(){
        return new ElectricityServiceImpl();
    }

    @Bean(name="gen")
    public ElectricityService getHydro(){
        return new HydroServiceImpl();
    }
    @Bean(name="nuc")
    public ElectricityService getNuclear(){
        return new NuclearServiceImpl();
    }
    @Bean(name="coal")
    public ElectricityService getCoal(){
        return new CoalServiceImpl();
    }
}
