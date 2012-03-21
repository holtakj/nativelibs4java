package lua;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.SizeT;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>lua</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("lua") 
@Runtime(CRuntime.class) 
public class LuaLibrary {
	static {
		BridJ.register();
	}
	/// <i>native declaration : lauxlib.h</i>
	public static final int LUA_REFNIL = (int)(-1);
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TNIL = (int)0;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXCSTACK = (int)8000;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_ERRMEM = (int)4;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_NUMBER_FMT = (String)"%.14g";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_YIELD = (int)1;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUA_MAXCAPTURES = (int)32;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCSTOP = (int)0;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TFUNCTION = (int)6;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCSETPAUSE = (int)6;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_NUMBER_SCAN = (String)"%lf";
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXINT32 = (int)2147483647;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCCOUNT = (int)3;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXVARS = (int)200;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_HOOKRET = (int)1;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCSETSTEPMUL = (int)7;
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_TABLIBNAME = (String)"table";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_REGISTRYINDEX = (int)(-10000);
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TTHREAD = (int)8;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_MASKRET = (int)(1 << 1);
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_EXECDIR = (String)"!";
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_CPATH = (String)"LUA_CPATH";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TUSERDATA = (int)7;
	/// <i>native declaration : lauxlib.h</i>
	public static final int LUA_ERRFILE = (int)(5 + 1);
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_OSLIBNAME = (String)"os";
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_IGMARK = (String)"-";
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_IOLIBNAME = (String)"io";
	/// <i>native declaration : lua.h</i>
	public static final String LUA_SIGNATURE = (String)"\033Lua";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TTABLE = (int)5;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_ENVIRONINDEX = (int)(-10001);
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_CDIR = (String)"!\\";
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_DIRSEP = (String)"\\";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_HOOKTAILRET = (int)4;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUA_IDSIZE = (int)60;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_HOOKLINE = (int)2;
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_MATHLIBNAME = (String)"math";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_ERRRUN = (int)2;
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_LOADLIBNAME = (String)"package";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_VERSION_NUM = (int)501;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TNONE = (int)(-1);
	/// <i>native declaration : luaconf.h</i>
	public static final int LUA_COMPAT_LSTR = (int)1;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TBOOLEAN = (int)1;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_PATHSEP = (String)";";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_MASKLINE = (int)(1 << 2);
	/// <i>native declaration : lua.h</i>
	public static final int LUA_MASKCOUNT = (int)(1 << 3);
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXCALLS = (int)20000;
	/// <i>native declaration : lua.h</i>
	public static final String LUA_VERSION = (String)"Lua 5.1";
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_LDIR = (String)"!\\lua\\";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_MULTRET = (int)(-1);
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_BITSINT = (int)32;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_INTFRMLEN = (String)"l";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_HOOKCOUNT = (int)3;
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_FILEHANDLE = (String)"FILE*";
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXNUMBER2STR = (int)32;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_GCPAUSE = (int)200;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXUPVALUES = (int)60;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCCOUNTB = (int)4;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_QS = (String)"'";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_HOOKCALL = (int)0;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_MASKCALL = (int)(1 << 0);
	/// <i>native declaration : lua.h</i>
	public static final String LUA_COPYRIGHT = (String)"Copyright (C) 1994-2008 Lua.org, PUC-Rio";
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_PATH = (String)"LUA_PATH";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TSTRING = (int)4;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_PATH_DEFAULT = (String)".\\?.lua;";
	/// <i>native declaration : lua.h</i>
	public static final String LUA_RELEASE = (String)"Lua 5.1.4";
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_COLIBNAME = (String)"coroutine";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCRESTART = (int)1;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCCOLLECT = (int)2;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_EXTRASPACE = (int)0;
	/// <i>native declaration : lua.h</i>
	public static final String LUA_AUTHORS = (String)"R. Ierusalimschy, L. H. de Figueiredo & W. Celes";
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_MAXCCALLS = (int)200;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GCSTEP = (int)5;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TNUMBER = (int)3;
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAL_BUFFERSIZE = (int)1024;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_ERRSYNTAX = (int)3;
	/// <i>native declaration : lua.h</i>
	public static final int LUA_MINSTACK = (int)20;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_INIT = (String)"LUA_INIT";
	/// <i>native declaration : lauxlib.h</i>
	public static final int LUA_NOREF = (int)(-2);
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_DBLIBNAME = (String)"debug";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_TLIGHTUSERDATA = (int)2;
	/// <i>native declaration : lualib.h</i>
	public static final String LUA_STRLIBNAME = (String)"string";
	/// <i>native declaration : luaconf.h</i>
	public static final int LUAI_GCMUL = (int)200;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_PATH_MARK = (String)"?";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_ERRERR = (int)5;
	/// <i>native declaration : luaconf.h</i>
	public static final String LUA_CPATH_DEFAULT = (String)".\\?.dll;";
	/// <i>native declaration : lua.h</i>
	public static final int LUA_GLOBALSINDEX = (int)(-10002);
	/// <i>native declaration : lualib.h</i>
	public static abstract class lua_CFunction extends Callback<lua_CFunction > {
		public abstract int apply(Pointer<LuaLibrary.lua_State > L);
	};
	/**
	 * * functions that read/write blocks when loading/dumping Lua chunks<br>
	 * <i>native declaration : lua.h:57</i>
	 */
	public static abstract class lua_Reader extends Callback<lua_Reader > {
		public abstract Pointer<Byte > apply(Pointer<LuaLibrary.lua_State > L, Pointer<? > ud, Pointer<SizeT > sz);
	};
	/// <i>native declaration : lualib.h</i>
	public static abstract class lua_Writer extends Callback<lua_Writer > {
		public abstract int apply(Pointer<LuaLibrary.lua_State > L, Pointer<? > p, @Ptr long sz, Pointer<? > ud);
	};
	/**
	 * * prototype for memory-allocation functions<br>
	 * <i>native declaration : lua.h:65</i>
	 */
	public static abstract class lua_Alloc extends Callback<lua_Alloc > {
		public abstract Pointer<? > apply(Pointer<? > ud, Pointer<? > ptr, @Ptr long osize, @Ptr long nsize);
	};
	/**
	 * Functions to be called by the debuger in specific events<br>
	 * <i>native declaration : lualib.h</i>
	 */
	public static abstract class lua_Hook extends Callback<lua_Hook > {
		public abstract void apply(Pointer<LuaLibrary.lua_State > L, Pointer<lua_Debug > ar);
	};
	public static native Pointer<LuaLibrary.lua_State > lua_newstate(Pointer<LuaLibrary.lua_Alloc > f, Pointer<? > ud);
	public static native void lua_close(Pointer<LuaLibrary.lua_State > L);
	public static native Pointer<LuaLibrary.lua_State > lua_newthread(Pointer<LuaLibrary.lua_State > L);
	public static native Pointer<LuaLibrary.lua_CFunction > lua_atpanic(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_CFunction > panicf);
	public static native int lua_gettop(Pointer<LuaLibrary.lua_State > L);
	public static native void lua_settop(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_pushvalue(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_remove(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_insert(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_replace(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native int lua_checkstack(Pointer<LuaLibrary.lua_State > L, int sz);
	public static native void lua_xmove(Pointer<LuaLibrary.lua_State > from, Pointer<LuaLibrary.lua_State > to, int n);
	public static native int lua_isnumber(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native int lua_isstring(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native int lua_iscfunction(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native int lua_isuserdata(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native int lua_type(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native Pointer<Byte > lua_typename(Pointer<LuaLibrary.lua_State > L, int tp);
	public static native int lua_equal(Pointer<LuaLibrary.lua_State > L, int idx1, int idx2);
	public static native int lua_rawequal(Pointer<LuaLibrary.lua_State > L, int idx1, int idx2);
	public static native int lua_lessthan(Pointer<LuaLibrary.lua_State > L, int idx1, int idx2);
	public static native double lua_tonumber(Pointer<LuaLibrary.lua_State > L, int idx);
	@Ptr 
	public static native long lua_tointeger(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native int lua_toboolean(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native Pointer<Byte > lua_tolstring(Pointer<LuaLibrary.lua_State > L, int idx, Pointer<SizeT > len);
	@Ptr 
	public static native long lua_objlen(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native Pointer<LuaLibrary.lua_CFunction > lua_tocfunction(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native Pointer<? > lua_touserdata(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native Pointer<LuaLibrary.lua_State > lua_tothread(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native Pointer<? > lua_topointer(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_pushnil(Pointer<LuaLibrary.lua_State > L);
	public static native void lua_pushnumber(Pointer<LuaLibrary.lua_State > L, double n);
	public static native void lua_pushinteger(Pointer<LuaLibrary.lua_State > L, @Ptr long n);
	public static native void lua_pushlstring(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > s, @Ptr long l);
	public static native void lua_pushstring(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > s);
	public static native Pointer<Byte > lua_pushvfstring(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > fmt, Pointer<? > argp);
	public static native Pointer<Byte > lua_pushfstring(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > fmt, Object... varargs);
	public static native void lua_pushcclosure(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_CFunction > fn, int n);
	public static native void lua_pushboolean(Pointer<LuaLibrary.lua_State > L, int b);
	public static native void lua_pushlightuserdata(Pointer<LuaLibrary.lua_State > L, Pointer<? > p);
	public static native int lua_pushthread(Pointer<LuaLibrary.lua_State > L);
	public static native void lua_gettable(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_getfield(Pointer<LuaLibrary.lua_State > L, int idx, Pointer<Byte > k);
	public static native void lua_rawget(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_rawgeti(Pointer<LuaLibrary.lua_State > L, int idx, int n);
	public static native void lua_createtable(Pointer<LuaLibrary.lua_State > L, int narr, int nrec);
	public static native Pointer<? > lua_newuserdata(Pointer<LuaLibrary.lua_State > L, @Ptr long sz);
	public static native int lua_getmetatable(Pointer<LuaLibrary.lua_State > L, int objindex);
	public static native void lua_getfenv(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_settable(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_setfield(Pointer<LuaLibrary.lua_State > L, int idx, Pointer<Byte > k);
	public static native void lua_rawset(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_rawseti(Pointer<LuaLibrary.lua_State > L, int idx, int n);
	public static native int lua_setmetatable(Pointer<LuaLibrary.lua_State > L, int objindex);
	public static native int lua_setfenv(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_call(Pointer<LuaLibrary.lua_State > L, int nargs, int nresults);
	public static native int lua_pcall(Pointer<LuaLibrary.lua_State > L, int nargs, int nresults, int errfunc);
	public static native int lua_cpcall(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_CFunction > func, Pointer<? > ud);
	public static native int lua_load(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_Reader > reader, Pointer<? > dt, Pointer<Byte > chunkname);
	public static native int lua_dump(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_Writer > writer, Pointer<? > data);
	public static native int lua_yield(Pointer<LuaLibrary.lua_State > L, int nresults);
	public static native int lua_resume(Pointer<LuaLibrary.lua_State > L, int narg);
	public static native int lua_status(Pointer<LuaLibrary.lua_State > L);
	public static native int lua_gc(Pointer<LuaLibrary.lua_State > L, int what, int data);
	public static native int lua_error(Pointer<LuaLibrary.lua_State > L);
	public static native int lua_next(Pointer<LuaLibrary.lua_State > L, int idx);
	public static native void lua_concat(Pointer<LuaLibrary.lua_State > L, int n);
	public static native Pointer<LuaLibrary.lua_Alloc > lua_getallocf(Pointer<LuaLibrary.lua_State > L, Pointer<Pointer<? > > ud);
	public static native void lua_setallocf(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_Alloc > f, Pointer<? > ud);
	public static native void lua_setlevel(Pointer<LuaLibrary.lua_State > from, Pointer<LuaLibrary.lua_State > to);
	public static native int lua_getstack(Pointer<LuaLibrary.lua_State > L, int level, Pointer<lua_Debug > ar);
	public static native int lua_getinfo(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > what, Pointer<lua_Debug > ar);
	public static native Pointer<Byte > lua_getlocal(Pointer<LuaLibrary.lua_State > L, Pointer<lua_Debug > ar, int n);
	public static native Pointer<Byte > lua_setlocal(Pointer<LuaLibrary.lua_State > L, Pointer<lua_Debug > ar, int n);
	public static native Pointer<Byte > lua_getupvalue(Pointer<LuaLibrary.lua_State > L, int funcindex, int n);
	public static native Pointer<Byte > lua_setupvalue(Pointer<LuaLibrary.lua_State > L, int funcindex, int n);
	public static native int lua_sethook(Pointer<LuaLibrary.lua_State > L, Pointer<LuaLibrary.lua_Hook > func, int mask, int count);
	public static native Pointer<LuaLibrary.lua_Hook > lua_gethook(Pointer<LuaLibrary.lua_State > L);
	public static native int lua_gethookmask(Pointer<LuaLibrary.lua_State > L);
	public static native int lua_gethookcount(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_base(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_table(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_io(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_os(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_string(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_math(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_debug(Pointer<LuaLibrary.lua_State > L);
	public static native int luaopen_package(Pointer<LuaLibrary.lua_State > L);
	public static native void luaL_openlibs(Pointer<LuaLibrary.lua_State > L);
	public static native void luaL_openlib(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > libname, Pointer<luaL_Reg > l, int nup);
	public static native void luaL_register(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > libname, Pointer<luaL_Reg > l);
	public static native int luaL_getmetafield(Pointer<LuaLibrary.lua_State > L, int obj, Pointer<Byte > e);
	public static native int luaL_callmeta(Pointer<LuaLibrary.lua_State > L, int obj, Pointer<Byte > e);
	public static native int luaL_typerror(Pointer<LuaLibrary.lua_State > L, int narg, Pointer<Byte > tname);
	public static native int luaL_argerror(Pointer<LuaLibrary.lua_State > L, int numarg, Pointer<Byte > extramsg);
	public static native Pointer<Byte > luaL_checklstring(Pointer<LuaLibrary.lua_State > L, int numArg, Pointer<SizeT > l);
	public static native Pointer<Byte > luaL_optlstring(Pointer<LuaLibrary.lua_State > L, int numArg, Pointer<Byte > def, Pointer<SizeT > l);
	public static native double luaL_checknumber(Pointer<LuaLibrary.lua_State > L, int numArg);
	public static native double luaL_optnumber(Pointer<LuaLibrary.lua_State > L, int nArg, double def);
	@Ptr 
	public static native long luaL_checkinteger(Pointer<LuaLibrary.lua_State > L, int numArg);
	@Ptr 
	public static native long luaL_optinteger(Pointer<LuaLibrary.lua_State > L, int nArg, @Ptr long def);
	public static native void luaL_checkstack(Pointer<LuaLibrary.lua_State > L, int sz, Pointer<Byte > msg);
	public static native void luaL_checktype(Pointer<LuaLibrary.lua_State > L, int narg, int t);
	public static native void luaL_checkany(Pointer<LuaLibrary.lua_State > L, int narg);
	public static native int luaL_newmetatable(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > tname);
	public static native Pointer<? > luaL_checkudata(Pointer<LuaLibrary.lua_State > L, int ud, Pointer<Byte > tname);
	public static native void luaL_where(Pointer<LuaLibrary.lua_State > L, int lvl);
	public static native int luaL_error(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > fmt, Object... varargs);
	public static native int luaL_checkoption(Pointer<LuaLibrary.lua_State > L, int narg, Pointer<Byte > def, Pointer<Pointer<Byte > > lst);
	public static native int luaL_ref(Pointer<LuaLibrary.lua_State > L, int t);
	public static native void luaL_unref(Pointer<LuaLibrary.lua_State > L, int t, int ref);
	public static native int luaL_loadfile(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > filename);
	public static native int luaL_loadbuffer(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > buff, @Ptr long sz, Pointer<Byte > name);
	public static native int luaL_loadstring(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > s);
	public static native Pointer<LuaLibrary.lua_State > luaL_newstate();
	public static native Pointer<Byte > luaL_gsub(Pointer<LuaLibrary.lua_State > L, Pointer<Byte > s, Pointer<Byte > p, Pointer<Byte > r);
	public static native Pointer<Byte > luaL_findtable(Pointer<LuaLibrary.lua_State > L, int idx, Pointer<Byte > fname, int szhint);
	public static native void luaL_buffinit(Pointer<LuaLibrary.lua_State > L, Pointer<luaL_Buffer > B);
	public static native Pointer<Byte > luaL_prepbuffer(Pointer<luaL_Buffer > B);
	public static native void luaL_addlstring(Pointer<luaL_Buffer > B, Pointer<Byte > s, @Ptr long l);
	public static native void luaL_addstring(Pointer<luaL_Buffer > B, Pointer<Byte > s);
	public static native void luaL_addvalue(Pointer<luaL_Buffer > B);
	public static native void luaL_pushresult(Pointer<luaL_Buffer > B);
	/// Conversion Error : null (void type !)
	/// Undefined type
	public static interface lua_State {
		
	};
}
