package lua;
import lua.LuaLibrary.lua_CFunction;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : lauxlib.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("lua") 
public class luaL_Reg extends StructObject {
	public luaL_Reg() {
		super();
	}
	/// C type : const char*
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : const char*
	@Field(0) 
	public luaL_Reg name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	/// C type : lua_CFunction
	@Field(1) 
	public Pointer<lua_CFunction > func() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : lua_CFunction
	@Field(1) 
	public luaL_Reg func(Pointer<lua_CFunction > func) {
		this.io.setPointerField(this, 1, func);
		return this;
	}
}
