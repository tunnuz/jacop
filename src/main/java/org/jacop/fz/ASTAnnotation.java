/* Generated By:JJTree: Do not edit this line. ASTAnnotation.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.jacop.fz;

public
class ASTAnnotation extends SimpleNode {
  public ASTAnnotation(int id) {
    super(id);
  }

  public ASTAnnotation(Parser p, int id) {
    super(p, id);
  }

    String ID;

    void setId(String id) {
	ID = id;
    }
    public String getAnnId() {
	return ID;
    }

    public String toString() {
	return super.toString() + ": " + ID;
    }
}
/* JavaCC - OriginalChecksum=0f977d6f8ea137aa8ba4f071b8a45298 (do not edit this line) */
