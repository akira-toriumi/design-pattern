package adapter.common.impl;

import adapter.Level1;
import adapter.common.StandardLevelIF;

public class Level2 extends Level1 implements StandardLevelIF {

	@Override
	public String getLogic() {
		return "言語なんて関係なし。なんでも出来ます。";
	}
}
