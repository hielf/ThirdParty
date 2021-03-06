package demo.djz;

import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;


/**
 * Interface for library <b>StockTrading</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
public interface IStockTrading {
	public static abstract class QuoteReceiver extends Callback<QuoteReceiver > {
		
		public abstract void apply(Pointer<CStructQuote > quote) ;
		
	};
	
	
	public static abstract class PositionReceiver extends Callback<PositionReceiver > {
		
		public abstract void apply(Pointer<CStructPosition > position) ;
		
	};
	
	public static abstract class BalanceReceiver extends Callback<BalanceReceiver > {	
		public abstract void apply(Pointer<CStructBalance > position) ;
		
	};
	
	public static abstract class OrderReceiver extends Callback<OrderReceiver > {	
		public abstract void apply(Pointer<CStructOutOrder > order) ;
	};
	
	public static abstract class StockDetailReceiver extends Callback<StockDetailReceiver > {	
		public abstract void apply(Pointer<CStructStockDetail > stockdetail) ;
		
	};
}
