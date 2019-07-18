package handlers.declaration;

import com.github.javaparser.ast.Node;
import handlers.BaseHandler;
import models.BCEToken;

import java.util.ArrayList;
import java.util.List;

public class EnumConstantDeclarationHandler extends BaseHandler {
    @Override
    public List<BCEToken> handle(Node node) {
        List<BCEToken> tokens = new ArrayList<>();
        tokens.add(new BCEToken("ENUM_CONSTANT", node));
        return tokens;
    }
}