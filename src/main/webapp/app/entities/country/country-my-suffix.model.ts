import { BaseEntity } from './../../shared';

export class CountryMySuffix implements BaseEntity {
    constructor(
        public id?: string,
        public countryName?: string,
    ) {
    }
}
