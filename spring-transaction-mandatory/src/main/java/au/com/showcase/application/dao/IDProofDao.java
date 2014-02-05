package au.com.showcase.application.dao;

import au.com.showcase.application.model.IDProof;

public interface IDProofDao {

	void save(IDProof stock);

	void update(IDProof stock);

	void delete(IDProof stock);

	IDProof findByStockCode(String stockCode);

}
