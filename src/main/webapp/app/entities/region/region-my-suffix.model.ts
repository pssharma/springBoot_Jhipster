import { BaseEntity } from './../../shared';

export class RegionMySuffix implements BaseEntity {
    constructor(
        public id?: string,
        public regionName?: string,
    ) {
    }
}
