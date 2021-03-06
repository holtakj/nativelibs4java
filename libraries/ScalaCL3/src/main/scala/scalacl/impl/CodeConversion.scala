package scalacl
package impl

import scala.reflect.makro.Context

private[impl] object CodeConversion {
	def convertCode(c: Context)(
	    code: c.universe.Tree,
	    dimensionallyIteratedInput: Option[c.universe.Symbol],
	    dimensionallyIteratedOutput: Option[c.universe.Name],
	    dimensionRangeIndexes: Option[Seq[c.universe.Symbol]],
	    dimensionRangeOffsets: Option[Seq[c.universe.Symbol]],
	    dimensionRangeSteps: Option[Seq[c.universe.Symbol]],
	    capturedInputs: Seq[c.universe.Symbol],
	    capturedOutputs: Seq[c.universe.Symbol],
	    capturedConstants: Seq[c.universe.Symbol]): String = 
	{
	  val converter = new OpenCLConverter {
	    override val global = c.universe
	  }
	  
	  val tree = code.asInstanceOf[converter.global.Tree]
	  
	  val symbols = converter.getExternalSymbols(tree)
	  println(symbols)
	  val flat = converter.convert(tree)
	  println(flat)
	  "kernel void TODO() {}" // TODO
	}
}