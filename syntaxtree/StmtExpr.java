package syntaxtree;

import visitor.TypeVisitor;
import visitor.Visitor;

public abstract class StmtExpr {
	public abstract void accept(Visitor v);

	public abstract Type accept(TypeVisitor v);
}
