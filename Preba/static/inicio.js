gx.evt.autoSkip = false;
gx.define('inicio', false, function () {
   this.ServerClass =  "inicio" ;
   this.PackageName =  "com.prebakb" ;
   this.setObjectType("web");
   this.hasEnterEvent = false;
   this.skipOnEnter = false;
   this.autoRefresh = true;
   this.fullAjax = true;
   this.supportAjaxEvents =  true ;
   this.ajaxSecurityToken =  true ;
   this.SetStandaloneVars=function()
   {
   };
   this.e12072_client=function()
   {
      return this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e13072_client=function()
   {
      return this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3];
   this.GXLastCtrlId =3;
   GXValidFnc[2]={ id: 2, fld:"",grid:0};
   GXValidFnc[3]={ id: 3, fld:"MAINTABLE",grid:0};
   this.Events = {"e12072_client": ["ENTER", true] ,"e13072_client": ["CANCEL", true]};
   this.EvtParms["REFRESH"] = [[],[]];
   this.Initialize( );
});
gx.wi( function() { gx.createParentObj(inicio);});
