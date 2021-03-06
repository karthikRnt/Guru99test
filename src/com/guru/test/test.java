package com.guru.test;
         
 import io.selendroid.SelendroidCapabilities;
 import java.util.List;
        import org.testng.annotations.BeforeSuite;
        import org.testng.annotations.Test;
         
 /**
         * @author Guru99 Test App using Selendroid
             * Application under test: Guru99App
         *
         */
        public
                class test {
                 
                     //Declare web driver variable
            private WebDriver driver;
                        
    
            /**
             * Setup the environment before testing
             * @throws Exception
                 */
            @BeforeSuite
            public
                    void setUp() throws Exception {
                             
        //Start selendroid-standalone during test
                SelendroidConfiguration config = new SelendroidConfiguration();
                     
              // Add the selendroid-test-app to the standalone server
                config.addSupportedApp("Guru99App.apk");
                     
                  
                //start the standalone server
                SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
                    selendroidServer.launchSelendroid();
                 
               // Create the selendroid capabilities
                SelendroidCapabilities capa = new SelendroidCapabilities();
                     
         
               // Specify to use selendroid's test app
                capa.setAut("com.guru99app:1.0");
                    
               // Specify to use the Android device API 19
                capa.setPlatformVersion(DeviceTargetPlatform.ANDROID19);
                     
                // Don't request simulator, use real device
                capa.setEmulator(false);
                     /*this is a test code for demo 
                     of git hub
                     */
          
                //capa.wait(10000000);
                 
                // Create instance of Selendroid Driver
                driver = new SelendroidDriver(capa);
                            
            }
        }