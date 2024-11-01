package haui.store.service;

import java.util.List;

import haui.store.model.AddressModel;
import haui.store.entity.Address;
import haui.store.entity.District;
import haui.store.entity.Province;
import haui.store.entity.Ward;

public interface AddressService {	
	List<Address> findListAddressByEmail(String username);
	List<Province> findAllProvince();
	List<District> findDistrictByIdProvince(Integer id);
	List<Ward> findWardByIdProvinceAndIdDistrict(Integer idProvince, Integer idDistrict);
	AddressModel createAddress(AddressModel addressModel);
	Address getAddressById(int parseInt);
	void delete(Address address);
	Address findAddressById(String username, int id);
	AddressModel getOneAddressById(int id);
	List<District> getListDistrictByAdressId(Integer id);
	List<Ward> getListWardByAdressId(Integer id);
	AddressModel updateAddress(AddressModel addressModel, Integer id);
}
