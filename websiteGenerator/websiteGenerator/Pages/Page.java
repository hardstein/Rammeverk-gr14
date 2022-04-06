package websiteGenerator.Pages;

import websiteGenerator.SemanticElements.*;
import websiteGenerator.Util.*;

public abstract class Page {
   protected String fileName; 
   protected String content; 


   protected Theme theme;
   protected Header header;
   protected Main main;
   protected Nav nav;
   protected Aside aside;
   protected Footer footer; 

}
