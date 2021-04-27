package com.prebakb ;
import com.prebakb.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.prebakb.inicio", "/com.prebakb.inicio"})
public final  class inicio extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.prebakb.GXcfg.class);
      com.prebakb.inicio_impl pgm = new com.prebakb.inicio_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new inicio_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new inicio_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Inicio";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

