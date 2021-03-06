package bb.com.a.dao;

import java.util.List;

import org.springframework.ui.Model;

import bb.com.a.model.Bb_AddrDto;

public interface BbAddrDao {
	public List<Bb_AddrDto> allAddress() throws Exception;
	public boolean addrAdd(Model model, Bb_AddrDto dto) throws Exception;
	public boolean addrUpdate(Model model, Bb_AddrDto addr) throws Exception;
	public boolean addrDelete(Model model, Bb_AddrDto addr) throws Exception;
}
