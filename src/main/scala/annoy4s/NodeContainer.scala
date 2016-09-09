package annoy4s

abstract class NodeContainer(dim: Int, io: NodeIO) {

  final val nodeSizeInBytes = io.nodeSizeInBytes(dim)

  final val childrenCapacity = io.childrenCapacity(dim)

  val bufferType: String

  def ensureSize(n: Int, verbose: Boolean): Int

  def apply(i: Int): Node

  def newNode: Node

  def getSize: Int

  def flip(): Unit

}